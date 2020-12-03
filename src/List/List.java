package List;


public class List {
    //Написати програму на java для роботи з однозв'язним списком.
    //Список реалізувати у вигляді двох класів: список та елемент списку
    Element first;

    public List()
    {
        //Класи мають містити конструктори
    }
    public void addFist(int value){
        //додавання елементу в початок;
        if (first == null)
        {
            first = new Element(value);
        }
        else
        {
            Element tmp = new Element(value);
            tmp.next = first;
            first = tmp;
        }
    }

    public void delFirst(){
        //видалення елементу з початку;
        if (first != null) {
            first = first.next;
        }
    }
    public void show(){
        //виведення списку на екран.
        if (first != null){
            System.out.println("List: ");
            Element current = first;
            while (current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        else{
            System.out.println("List is empty");
        }
    }
}

