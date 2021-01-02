//package javapractise;
//
//public class MyHashMap<K ,V> {
//    MyLinkedList<K> myLinkedList;
//
//    public MyHashMap(){
//        this.myLinkedList = new MyLinkedList<>();
//    }
//    public V get(K key) {
//        javapractise.MyMapNode<K,V> myMapNode = (javapractise.MyMapNode<K,V>) this.myLinkedList.search(key);
//        return (myMapNode == null) ? null : myMapNode.getValue();
//    }
//
//    public void add(K key, V value) {
//        MyMapNode<K,V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
//        if (myMapNode == null) {
//            myMapNode = new MyMapNode<>(key, value);
//            this.myLinkedList.append(myMapNode);
//        }else {
//            myMapNode.setValue(value);
//        }
//    }
//}
