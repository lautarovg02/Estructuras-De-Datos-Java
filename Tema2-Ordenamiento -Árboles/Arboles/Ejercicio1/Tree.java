package Ejercicio1;

import java.util.ArrayList;

/*Ejercicio 1.
Implemente la estructura de Árbol Binario para búsquedas. Métodos:
Integer getRoot(), boolean hasElem(Integer), boolean isEmpty(), void add(Integer),boolean delete(Integer),
int getHeight(), void printPosOrder(), void printPreOrder(), void printInOrder(), List getLongestBranch(),
List getFrontera(), Integer getMaxElem(), List getElemAtLevel(int)
1. ¿Cuál es la complejidad de cada uno de estos métodos? */
public class Tree {

    private Integer value;
    private Tree left;

    private Tree right;

    public void setValue(Integer value) {
        this.value = value;
    }

    public Tree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void add(Integer newValue) {
        if (newValue < this.getValue()) {
            if (this.getLeft() == null) this.setLeft(new Tree(newValue));
            else this.getLeft().add(newValue);
        } else if (newValue > this.getValue()) {
            if (this.getRight() == null) this.setRight(new Tree(newValue));
            else this.getRight().add(newValue);
        }
    }

    public boolean isLeave() {
        if (this.getRight() != null || this.getLeft() != null) {
            return false;
        }
        return true;
    }

    public boolean delete(int number) {
        boolean deleted = false;

        if (this.hasElem(number)) {

            if (this.getValue().equals(number)) {
//
                if (this.getRight() != null && this.getLeft() != null) {
                    this.setValue(this.getRight().getMinElem());
                    return this.getRight().delete(this.getValue());
                }
                if (this.getRight() == null && this.getLeft() != null) {
                    this.setValue(this.getLeft().getMinElem());
                    return this.getLeft().delete(this.getValue());
                }
                if (this.getRight() != null && this.getLeft() == null) {
                    this.setValue(this.getRight().getMinElem());
                    return this.getRight().delete(this.getValue());
                }

            }

            if (this.getRight().isLeave() && this.getRight().getValue().equals(number)) {
                    this.setRight(null);
                    deleted = true;
            }
            if (this.getLeft().isLeave() && this.getLeft().getValue().equals(number)) {
                    this.setLeft(null);
                    deleted = true;
            } else {
                // * ----------- OPERACIONES SI EL NUMERO ES IGUAL A ALGUN HIJO DEL ARBOL EN EL Q ESTOY PARADO -----------
                Tree aux;
                Tree temp;
                if (number > this.getValue() && !this.getRight().isEmpty()) {

                    if (this.getRight().getValue().equals(number)) {
                        // * ----------- OPERACIONES SI EL NUM ES IGUAL AL HIJO DE LA DERECHA -----------

                        if (this.getRight().getRight() != null && this.getRight().getLeft() != null) {
                            // * ----------- OPERACIONES SI EL HIJO DE LA DERECHA TIENE  DOS HIJOS -----------
                            if (this.getRight().getRight().getLeft() != null) {
                                temp = this.getRight().getRight();
                                aux = this.getRight().getRight().getLeft();
                                // * Buscamos el nodo mas a la izquierda posible
                                while (aux.getLeft() != null) {
                                    temp = aux;
                                    aux = aux.getLeft();
                                }
                                // * Eliminamos el valor de aux, para q luego no quede repetido en el arbol
                                this.getRight().delete(aux.getValue());
                                // * Les seteamos los hijos del arbol a eliminar
                                aux.setRight(this.getRight().getRight());
                                aux.setLeft(this.getRight().getLeft());
                                // * Pisamos el arbol a eliminar con aux
                                this.setRight(aux);
                                deleted = true;
                            } else {
                                // *   OPERACION SI EL NMISD ES EL PRIMERO DE LA DERECHA
                                // * Obtenemos el valor del nodo mas a la izquierda del sub arbol derecho
                                aux = this.getRight().getRight();
                                // * les seteamos el hijo del arbol a eliminar para no perderlos
                                aux.setLeft(this.getRight().getLeft());
                                // * Pisamos el valor a eliminar con aux
                                this.setRight(aux);
                                deleted = true;
                            }
                        }
                        // * ----------- OPERACIONES SI EL HIJO DE LA DERECHA  SOLO TIENE UN HIJO  -----------
                        if (this.getRight().getRight() == null && this.getRight().getLeft() != null) {
                            // * OPERACION SI EL  HIJO ESTA A LA IZQUIERDA
                            aux = this.getRight().getLeft();
                            this.setRight(aux);
                            deleted = true;
                        }
                        if (this.getRight().getRight() != null && this.getRight().getLeft() == null) {
                            // *OPERACION SI EL  HIJO ESTA A LA DERECHA
                            aux = this.getRight().getRight();
                            this.setRight(aux);
                            deleted = true;
                        }
                    } else deleted = this.getRight().delete(number);

                }

                if (number < this.getValue() && !this.getLeft().isEmpty()) {

                    if (this.getLeft().getValue().equals(number)) {
                        // * ----------- OPERACIONES SI EL NUM ES IGUAL AL HIJO DE LA IZQUIERDA -----------
                        if (this.getLeft().getRight() != null && this.getLeft().getLeft() != null) {
                            // * ----------- OPERACIONES SI EL HIJO DE LA IZQUIERDA TIENE  DOS HIJOS -----------
                            if (this.getLeft().getRight().getLeft() != null) {
                                temp = this.getLeft().getRight();
                                aux = this.getLeft().getRight().getLeft();
                                // * Buscamos el nodo mas a la izquierda posible
                                while (aux.getLeft() != null) {
                                    temp = aux;
                                    aux = aux.getLeft();
                                }
                                // * Eliminamos el valor de aux, para q luego no quede repetido en el arbol
                                this.getLeft().delete(aux.getValue());
                                // * Les seteamos los hijos del arbol a eliminar
                                aux.setRight(this.getLeft().getRight());
                                aux.setLeft(this.getLeft().getLeft());
                                // * Pisamos el arbol a eliminar con aux
                                this.setLeft(aux);
                                deleted = true;
                            } else {
                                // *   OPERACION SI EL NMISD ES EL PRIMERO DE LA DERECHA
                                // * Obtenemos el valor del nodo mas a la izquierda del sub arbol derecho
                                aux = this.getLeft().getRight();
                                // * les seteamos el hijo del arbol a eliminar para no perderlos
                                aux.setLeft(this.getLeft().getLeft());
                                // * Pisamos el valor a eliminar con aux
                                this.setLeft(aux);
                                deleted = true;
                            }
                        }
                        // * ----------- OPERACIONES SI EL HIJO DE LA IZQUIERDA  SOLO TIENE UN HIJO  -----------
                        if (this.getLeft().getRight() == null && this.getLeft().getLeft() != null) {
                            // * OPERACION SI EL  HIJO ESTA A LA IZQUIERDA
                            aux = this.getLeft().getLeft();
                            this.setLeft(aux);
                            deleted = true;
                        }
                        if (this.getLeft().getRight() != null && this.getLeft().getLeft() == null) {
                            // *OPERACION SI EL  HIJO ESTA A LA DERECHA
                            aux = this.getLeft().getRight();
//                            this.setLeft(null);
                            this.setLeft(aux);
                            deleted = true;
                        }
                    } else deleted = this.getLeft().delete(number);
                }
            }
        }
        return deleted;
    }

    public int getHeight() {
//    public ArrayList<Integer> getLongBranch(){
        int heightRight = 0;
        int heightLeft = 0;
        if (this.getRight() != null) {
            heightRight++;
            heightRight += getRight().getHeight();
        }
        if (this.getLeft() != null) {
            heightLeft++;
            heightLeft += getLeft().getHeight();
        }

        return Math.max(heightRight, heightLeft);
    }

    public ArrayList<Integer> getElemAtLevel(int level) {
        ArrayList<Integer> elementsOfALevel = new ArrayList<Integer>();

        if (this.getHeight() >= level) {
            if (level > 0) {
                if (this.getRight() != null && this.getRight().getElemAtLevel(level - 1) != null)
                    elementsOfALevel.addAll(this.getRight().getElemAtLevel(level - 1));

                if (this.getLeft() != null && this.getLeft().getElemAtLevel(level - 1) != null)
                    elementsOfALevel.addAll(this.getLeft().getElemAtLevel(level - 1));
            }
            if (level == 0) {
//                System.out.println("agrego a: " + this.getValue());
                elementsOfALevel.add(this.getValue());
            }

        } else {
            System.out.println("No existe el nivel: " + level);
            return null;
        }
        return elementsOfALevel;
    }

    public ArrayList<Integer> getLeaves() {
        ArrayList<Integer> leaves = new ArrayList<Integer>();

        if (this.getRight() != null) {
            leaves.addAll(this.getRight().getLeaves());
        }
        if (this.getLeft() != null) {
            leaves.addAll(this.getLeft().getLeaves());
        }
        if (this.getLeft() == null && this.getRight() == null) {
            leaves.add(this.getValue());
        }

        return leaves;
    }

    public ArrayList<Integer> getLongestBranch() {
        ArrayList<Integer> elementsRight = new ArrayList<>();
        ArrayList<Integer> elementsLeft = new ArrayList<>();

        elementsLeft.add(this.getValue());
        elementsRight.add(this.getValue());

        if (this.getRight() != null) elementsRight.addAll(this.getRight().getLongestBranch());

        if (this.getLeft() != null) elementsLeft.addAll(this.getLeft().getLongestBranch());

        if (elementsRight.size() > elementsLeft.size()) return elementsRight;
        else return elementsLeft;
    }

    @Override
    public String toString() {
        return "Tree{" + "value=" + this.getValue() + '}';
    }

    public int getMaxElem() {
        int majorElem;
        if (this.getRight() != null) return this.getRight().getMaxElem();
        else majorElem = this.getValue();
        return majorElem;
    }


    public int getMinElem() {
        int minorElement;
        if (this.getLeft() != null) return this.getLeft().getMinElem();
        else minorElement = this.getValue();
        return minorElement;
    }

    public boolean hasElem(int element) {
        if (this.getValue().equals(element)) return true;
        else {
            if (this.getValue() < element && this.getRight() != null) return this.getRight().hasElem(element);

            if (this.getValue() > element && this.getLeft() != null) return this.getLeft().hasElem(element);

        }
        return false;
    }


    public void printPreorder() {
        if (this.getValue() == null) return;

        System.out.print(this.getValue() + " ");

        Tree left = this.getLeft();
        Tree right = this.getRight();

        if (left != null) this.getLeft().printPreorder();

        if (right != null) this.getRight().printPreorder();

    }

    public void printPostorder() {
        if (this.getValue() == null) return;

        Tree left = this.getLeft();
        Tree right = this.getRight();

        if (left != null) left.printPostorder();

        if (right != null) right.printPostorder();

        System.out.print(this.getValue() + " ");
    }

    public void printInorder() {
        if (this.getValue() == null) return;

        if (this.getLeft() != null) this.getLeft().printInorder();

        System.out.print(this.getValue() + " ");

        if (this.getRight() != null) this.getRight().printInorder();

    }

    public Tree getLeft() {
        return this.left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return this.right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    public Integer getValue() {
        return this.value;
    }

    public boolean isEmpty() {
        return this.value == null;
    }


}