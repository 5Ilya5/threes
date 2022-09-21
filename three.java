class GFG

{

    static final int COUNT = 10;

    // Узел двоичного дерева

    static class Node

    {

        int data;

    Node left, right;

        /*Конструктор,
        который выделяет
        новый узел
        с

    заданные
        данные и
        нулевые левый
        и правый указатели.*/

        Node(int data)

        {

            this.data = data;

            this.left = null;

            this.right = null;

        }

    };

    // Функция для печати двоичного дерева в 2D
    // Это обратный порядок обхода

    static void print2DUtil(Node root, int space)

    {

        // Базовый вариант

        if (root == null)

            return;

        // Увеличить расстояние между уровнями

        space += COUNT;

        // Сначала обрабатываем правого потомка

        print2DUtil(root.right, space);

        // Печатать текущий узел после пробела

        // считать

        System.out.print("(");

        for (int i = COUNT; i < space; i++)

            System.out.print("");

        System.out.print(root.data + ")");

        // Обработка левого потомка

        print2DUtil(root.left, space);

    }

    // Обертка над print2DUtil ()

    static void print2D(Node root)

    {

        // Передаем начальное количество пробелов как 0

        print2DUtil(root, 0);

    }

    // Код драйвера

    public static void main(String args[])

    {

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        root.left.left = new Node(4);

        root.left.right = new Node(5);

        root.right.left = new Node(6);

        root.right.right = new Node(7);

        root.left.left.left = new Node(8);

        root.left.left.right = new Node(9);

        root.left.right.left = new Node(10);

        root.left.right.right = new Node(11);

        root.right.left.left = new Node(12);

        root.right.left.right = new Node(13);

        root.right.right.left = new Node(14);

        root.right.right.right = new Node(15);

        print2D(root);

    }
}
  