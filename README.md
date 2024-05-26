# Марко Ивановски 226089

## Control Flow Graphh
![Graph](https://github.com/Marko-Ivanovski/SI_2024_lab2_226089/blob/master/Graph.png)
## Цикломатска комплексност
Цикломатската комплексност може да се пресмета користејки ја формулата <b>P + 1</b>, каде што <b>P</b> е бројот на предикатни јазли <b>+ 1</b>. Овој код има 9 предикатни јазли и со формулата <b>9 + 1 = 10</b>.
## Тест случаи според Every Branch критериумот
![Graph](https://github.com/Marko-Ivanovski/SI_2024_lab2_226089/blob/master/TestCases1.png)
### Објаснување
Доволно се 5 тест примери за да се поминат сите  гранки:
<ol>
  <li>
    <p><b>allItems = null</b> - Листата е null и враќа <b>RuntimeException("allItems list can't be null!")</b>.</p>
  </li>
  <li>
    <p><b>List<Item> items = Arrays.asList(new Item("", null, 100, 0));</b> - Името е празно и се пополнува со "unknown", и нема баркод затоа враќа <b>RuntimeException("No barcode!")</b>
  </li>
  <li>
    <p><b>List<Item> items = Arrays.asList(new Item("item1", "abc123", 100, 0));</b> - Невалиден формат за бракодот, враќа <b>RuntimeException("Invalid character in item barcode!")</b></p>
  </li>
  <li>
    
  </li>
  <li>
    
  </li>
</ol>
