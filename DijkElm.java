public class DijkElm implements Comparable<DijkElm> {

    private int vertex;
    private int weight;

    public DijkElm(int inv, int inw) {
        vertex = inv;
        weight = inw;
    }

    public DijkElm() {
        vertex=0;
        weight=0;
    }

    public int key(){return weight;}
    public int vertex(){return vertex;}

    @Override
    public int compareTo(DijkElm that) {
        if (weight < that.key()) return -1;
        else if(weight==that.key()) return 0;
        else return 1;
    }
}
