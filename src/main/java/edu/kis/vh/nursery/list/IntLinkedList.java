package edu.kis.vh.nursery.list;

/*
 * Klasa IntLinkedList to implementacja listy jednokierunkowej
 * przechowujacej wartosci liczbowe typu stala (Integer).
 * Zawiera w sobie klase wewnetrzna Node oraz metody sluzace do
 * dodawania nowej wartosci, usuwania ostatnio dodanej wartosci, 
 * sprawdzania stanu listy i przechowywanych w niej liczb.
 */
public class IntLinkedList {

    /*
     * Klasa Node to klasa wewnetrzna IntLinkedList.
     * Przechowuje wartosc liczby oraz referencje do poprzedniego i nastepnego wierzcholka.
     */
	private class Node {

	    private final int value; // Przechowywana liczba
	    private Node prev; // Referencja do poprzedniego wierzcholka
	    private Node next; // Referencja do nastepnego wierzcholka

	    /*
	     * Konstruktor klasy Node.
	     * Inicjalizuje wartosc wierzcholka na podana liczbe.
	     */
	    public Node(int i) {
	        value = i;
	    }

	    /*
	     * Zwraca wartosc przechowywana w wezle.
	     */
	    public int getValue() {
	        return value;
	    }

	    /*
	     * Zwraca referencje do poprzedniego wierzcholka.
	     */
	    public Node getPrev() {
	        return prev;
	    }

	    /*
	     * Ustawia referencje do poprzedniego wierzcholka.
	     */
	    public void setPrev(Node prev) {
	        this.prev = prev;
	    }

	    /*
	     * Zwraca referencje do nastepnego wierzcholka.
	     */
	    public Node getNext() {
	        return next;
	    }

	    /*
	     * Ustawia referencje do nastepnego wierzcholka.
	     */
	    public void setNext(Node next) {
	        this.next = next;
	    }

	}

    private Node last; // Ostatnio dodany wierzcholek

    /*
     * Dodaje nowa wartosc na koniec listy.
     * Tworzy nowy wierzcholek i ustawia go jako ostatni element.
     */
    public void push(int value) {
        if (last == null) {
            last = new Node(value);
        } else {
            last.setNext(new Node(value));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /*
     * Sprawdza, czy lista jest pusta.
     * Zwraca true, jezeli lista nie zawiera elementow.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /*
     * Zawsze zwraca false, poniewaz lista nie ma ograniczen pojemnosciowych.
     */
    public boolean isFull() {	// TODO: do usuniecia, lista nie ma ograniczonego rozmiaru
        return false;
    }

    /*
     * Zwraca wartosc ostatniego elementu listy.
     * Jeżeli lista jest pusta, zwraca -1.
     */
    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return last.getValue();
    }

    /*
     * Usuwa i zwraca wartosc ostatniego elementu listy.
     * Jeżeli lista jest pusta, zwraca -1.
     */
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
