package jp.co.systena.tigerscave.shoppingcart.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import jp.co.systena.tigerscave.shoppingcart.model.Item;

/**
 * The Class ListService.
 */
@Service
public class ListService {

  /**
   * 商品一覧取得
   *
   * @return 商品一覧
   */
  public Map<Integer, Item> getItemList() {

    Item item1 = new Item(10, "キーボード", 1000);
    Item item2 = new Item(20, "ノートパソコン", 10000);
    Item item3 = new Item(30, "マウス", 100);

    // 商品をMapに格納
    Map<Integer, Item> itemListMap = new LinkedHashMap<Integer, Item>();
    itemListMap.put(item1.getItemId(), item1);
    itemListMap.put(item2.getItemId(), item2);
    itemListMap.put(item3.getItemId(), item3);

    return itemListMap;
  }

}
