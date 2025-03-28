package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter //단순히 데이터를 왔다갔다할 때 쓰는 DTO에선 @Data를 써도 괜찮음
public class Item {
    private Long id;
    private String itemName;
    private Integer price; // null로 들어갈 가능성도 있음
    private Integer quantity;


    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
