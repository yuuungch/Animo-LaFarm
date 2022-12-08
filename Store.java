public class Store {
    // attributes
    private Seeds[] seeds;
    private int currNum;
    private Seeds seedInfo;

    // constructor
    public Store(int numSeeds) {
        seeds = new Seeds[numSeeds];
        currNum = 1;
        seedInfo = new Seeds(0);

        for (int i = 0; i < seeds.length; i++) {
            seeds[i] = new Seeds(i + 1);
        }
    }

    public int getCurrent() {
        return currNum;
    }

    public int getNumSeeds() {
        return seeds.length;
    }

    public Seeds getSeedInfo() {
        return seedInfo;
    }

    public String getCurrentSeedName() {
        // generate info
        seedInfo.Generate(currNum);
        return seedInfo.getName();
        // return seeds[currNum-1].getName();
    }

    public String getCurrentSeedDesc() {
        // return seeds[currNum - 1].getDesc();
        seedInfo.Generate(currNum);
        return seedInfo.getDesc();
    }

    public void setCurrentSeedName(String name) {
        // seeds[currNum - 1].setName(name);
        getCurrent();
        seeds[currNum - 1].setName(seedInfo.getName());
    }

    public void setCurrentSeedDesc(String desc) {
        // seeds[currNum - 1].setDesc(desc);
        getCurrent();
        seeds[currNum - 1].setName(seedInfo.getDesc());
    }

    public void prevSeed() {
        if (!isFirstSeed()) {
            currNum--;
        }
    }

    public void nextSeed() {
        if (!isLastSeed()) {
            currNum++;
        }
    }

    public boolean isFirstSeed() {
        return currNum == 1;
    }

    public boolean isLastSeed() {
        return currNum == seeds.length;
    }
}
