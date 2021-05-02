package structures.hashmap;

public class HashTable {
    private SortedList[] hashArray;   // Массив списков
    private int arraySize;

    public HashTable(int size) {
        arraySize = size;
        hashArray = new SortedList[arraySize];  // Создание массива
        for (int j = 0; j < arraySize; j++)          // Заполнение массива
            hashArray[j] = new SortedList();     // списками
    }

    public int hashFunc(int key) {
        return key % arraySize;
    }

    public void insert(Link theLink) {
        int key = theLink.getKey();
        int hashVal = hashFunc(key);   // Хеширование ключа
        hashArray[hashVal].insert(theLink); // Вставка в позиции hashVal
    }

    public void delete(int key) {
        int hashVal = hashFunc(key);   // Хеширование ключа
        hashArray[hashVal].delete(key); // Удаление
    }

    public Link find(int key) {
        int hashVal = hashFunc(key);   // Хеширование ключа
        Link theLink = hashArray[hashVal].find(key);  // Поиск
        return theLink;                // Метод возвращает найденный элемент
    }
}
