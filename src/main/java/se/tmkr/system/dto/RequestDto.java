package se.tmkr.system.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDto {


    private String reqNo;
    private String reqDealerId;
    private String dealerUserId;
    private String bizArea;


    @Override
    public String toString() {
        return "RequestDto{" +
                "reqNo='" + reqNo + '\'' +
                ", reqDealerId='" + reqDealerId + '\'' +
                ", dealerUserId='" + dealerUserId + '\'' +
                ", bizArea='" + bizArea + '\'' +
                '}';
    }

}
