# Марко Ивановски 226089

## Control Flow Graph
![Graph](https://github.com/Marko-Ivanovski/SI_2024_lab2_226089/blob/master/Graph.png)
## Цикломатска комплексност
Цикломатската комплексност може да се пресмета користејки ја формулата <b>P + 1</b>, каде што <b>P</b> е бројот на предикатни јазли <b>+ 1</b>. Овој код има 9 предикатни јазли и со формулата <b>9 + 1 = 10</b>.
## Тест случаи според Every Branch критериумот
![Graph](https://github.com/Marko-Ivanovski/SI_2024_lab2_226089/blob/master/TestCases1.png)
### Објаснување
Доволно се 5 тест примери за да се поминат сите гранки:
<ol>
  <li>
    <p><b>allItems = null</b> - Листата е null и враќа <b>RuntimeException("allItems list can't be null!")</b>.</p>
  </li>
  <li>
    <p><b>List<Item> items = Arrays.asList(new Item("", null, 100, 0));</b> - Името е празно и се пополнува со "unknown", и нема баркод затоа враќа <b>RuntimeException("No barcode!")</b>.</p>
  </li>
  <li>
    <p><b>List<Item> items = Arrays.asList(new Item("item1", "abc123", 100, 0));</b> - Невалиден формат за бракодот, враќа <b>RuntimeException("Invalid character in item barcode!")</b>.</p>
  </li>
  <li>
    <p><b>List<Item> items = Arrays.asList(new Item("item1", "123456", 100, 0));</b> - Валидно внесени податоци, но без попуст(discount), враќа <b>true</b>.</p>
  </li>
  <li>
    <p><b>List<Item> items = Arrays.asList(new Item("item1", "012345", 350, 0.1));</b> - Валидно внесени податоци, со баркод што почнува со 0 и има попуст(discount), за да исполнува условот <b>if(item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')</b>. Враќа <b>false</b>.</p>
  </li>
</ol>
      
## Тест случаи според Multiple Condition критериумот
![Graph](https://github.com/Marko-Ivanovski/SI_2024_lab2_226089/blob/master/TestCases2.png)
### Објаснување
Потребни се 8 тест примери:
<ol>
  <li>
    <p><b>new Item("item1", "012345", 350, 0.1)</b> - Тука сите барања се <b>True(T)</b>.</p>
  </li>
  <li>
    <p><b>new Item("item1", "112345", 350, 0.1)</b> - Тука првите две барања се <b>True(T)</b>, последното е <b>False(F)</b>.</p>
  </li>
  <li>
    <p><b>new Item("item1", "012345", 350, 0)</b> - Тука првото и последното барање се <b>True(T)</b>, а второто барање е <b>False(F)</b>.</p>
  </li>
  <li>
    <p><b>new Item("item1", "112345", 350, 0)</b> - Тука само првото барање е <b>True(T)</b>, а последните 2 се <b>False(F)</b>.</p>
  </li>
  <li>
    <p><b>new Item("item1", "012345", 250, 0.1)</b> - Тука само првото барање е <b>False(F)</b>, а последните 2 се<b>True(T)</b>.</p>
  </li>
    <li>
    <p><b>new Item("item1", "112345", 250, 0.1)</b> - Тука првото и последното барање се <b>False</b>, а второто барање е <b>True(T)</b>.</p>
  </li>
  <li>
    <p><b>new Item("item1", "012345", 250, 0)</b> - Тука првите две барања се <b>False(F)</b>, а последното е <b>True(T)</b>.</p>
  </li>
  <li>
    <p><b>new Item("item1", "112345", 250, 0)</b> - Тука сите барања се <b>False(F)</b>.</p>
  </li>
</ol>
