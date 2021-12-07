package entity.order;

import utils.Configs;

import java.time.LocalDateTime;
/**
 * This class is an entity for Rush Order
 * 
 * @author Nguyen Thuy Dung
 * @version 1.0
 * <p>
 * created_at: 07/12/2021
 * <p>
 * project_name: An Internet Media Store (AIMS)
 * <p>
 * teacher_name: Dr. Nguyen Thi Thu Trang
 * <p>
 * class_name: ICT 01.K63
 * <p>
 * helpers: Teaching Assistants 
 * 
 *
 */
public class RushOrder extends Order {
    private LocalDateTime deliveryTime;

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
