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

    /**
     * @return int
     */
    public int getCurrent() {
        return currNum;
    }

    /**
     * @return int
     */
    public int getNumSeeds() {
        return seeds.length;
    }

    /**
     * @return Seeds
     */
    public Seeds getSeedInfo() {
        return seedInfo;
    }

    /**
     * @return String
     */
    public String getCurrentSeedName() {
        // generate info
        seedInfo.Generate(currNum);
        return seedInfo.getName();
        // return seeds[currNum-1].getName();
    }

    /**
     * @return String
     */
    public String getCurrentSeedDesc() {
        // return seeds[currNum - 1].getDesc();
        seedInfo.Generate(currNum);
        return seedInfo.getDesc();
    }

    /**
     * @param name
     */
    public void setCurrentSeedName(String name) {
        // seeds[currNum - 1].setName(name);
        getCurrent();
        seeds[currNum - 1].setName(seedInfo.getName());
    }

    /**
     * @param desc
     */
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

    /**
     * @return boolean
     */
    public boolean isFirstSeed() {
        return currNum == 1;
    }

    /**
     * @return boolean
     */
    public boolean isLastSeed() {
        return currNum == seeds.length;
    }
}
