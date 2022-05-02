package se.tmkr.system.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import se.tmkr.system.common.CamelMap;

import javax.sql.DataSource;
@Configuration
@EnableTransactionManagement
public class MybatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/*Mapper.xml");
        sessionFactory.setMapperLocations(res);
        sessionFactory.setTypeAliasesPackage("se.tmkr.system.dto");
        sessionFactory.setTypeAliases(CamelMap.class);

        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setCallSettersOnNulls(false);
        configuration.setJdbcTypeForNull(null);

        sessionFactory.setConfiguration(configuration);

        return sessionFactory.getObject();
    }

}
