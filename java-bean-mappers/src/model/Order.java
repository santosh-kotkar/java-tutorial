package model;

import lombok.Data;

@Data
public class Order {
    Customer customer;
    Address billingAddress;
}
