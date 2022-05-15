package Task;

public class JavaScore {
    private double Score;
    private String Grade_Score;
    private int Rank;
    private boolean retake;

    public JavaScore() {}

    public JavaScore(double score) {
        Score = score;
    }

    public double GetScore() {
        return this.Score;
    }

    public int InputRank(int rank) {
        this.Rank = rank;
        return this.Rank;
    }

    public int GetRank() {
        return this.Rank;
    }

    public boolean Setretake(double average) {
        if (this.Score < average) {
            this.retake = true;
        }
        else {
            this.retake = false;
        }
        return retake;
    }


}
