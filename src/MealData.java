import java.math.BigDecimal;

class MealData {
    // FIELD
    private String place; // 場所
    private String name; // 名称
    private String 	category; // 区分
    private int value; // 価格
    private double kcal; // カロリー
    private double protein; // タンパク質
    private double lipid; // 脂質
    private double carbohydrate; // 炭水化物
    private double salt; // 食塩
    private int calcium; // カルシウム量(mg)
    private int vegetable; // 野菜量



    // コンストラクタ Fieldへの格納を強制する
    MealData(String place,
             String name,
             String category,
             int value,
             double kcal,
             double protein,
             double lipid,
             double carbohydrate,
             double salt,
             int calcium,
             int vegetable) {
        setPlace(place);
        setName(name);
        setCategory(category);
        setValue(value);
        setKcal(kcal);
        setProtein(protein);
        setLipid(lipid);
        setCarbohydrate(carbohydrate);
        setSalt(salt);
        setCalcium(calcium);
        setVegetable(vegetable);
    }

    // まだ確定していない場合の初期値
    MealData() {
        setPlace("リンク");
        setName("");
        setCategory("");
        setValue(0);
        setKcal(0);
        setProtein(0);
        setLipid(0);
        setCarbohydrate(0);
        setSalt(0);
        setCalcium(0);
        setVegetable(0);
    }

    // METHOD
    @Override
    public String toString() {
        String str =
                "場所　　:" + getPlace() + "\n" +
                "名称　　:" + getName() + "\n" +
                "区分　　:" + getCategory() + "\n" +
                "価格　　:" + getValue() + "\n" +
                "ｶﾛﾘｰ　　:" + Math.round(getKcal()) + "\n" +
                "ﾀﾝﾊﾟｸ質 :" + Math.round(getProtein()) + "\n" +
                "脂質　　:" + Math.round(getLipid()) + "\n" +
                "炭水化物:" + Math.round(getCarbohydrate()) + "\n" +
                "食塩量　:" + Math.round(getSalt()) + "\n" +
                "ｶﾙｼｳﾑ量 :" + getCalcium() + "\n" +
                "野菜量　:" + getVegetable();
        return str;
    }

    /**
     * 自身と引数データ同士の合計を算出, 名称は ”+” で表現 (不可逆になっているので直したいところ)
     * @param md 引数データ
     * @return 中身の合計をしたMealData型オブジェクト
     */
    public MealData combine(MealData md) {
        MealData mealData = new MealData(
                this.getPlace(),
                this.getName() + " ＋ " + md.getName(),
                "メイン",
                this.getValue() + md.getValue(),
                this.getKcal() + md.getKcal(),
                this.getProtein() + md.getProtein(),
                this.getLipid() + md.getLipid(),
                this.getCarbohydrate() + md.getCarbohydrate(),
                this.getSalt() + md.getSalt(),
                this.getCalcium() + md.getCalcium(),
                this.getVegetable() + md.getVegetable()
        );
        return mealData;
    }


    // setter
    public void setPlace(String place) {
        this.place = place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setLipid(double lipid) {
        this.lipid = lipid;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public void setCalcium(int calcium) {
        this.calcium = calcium;
    }

    public void setVegetable(int vegetable) {
        this.vegetable = vegetable;
    }


    // getter
    public String getPlace() {
        return this.place;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public int getValue() {
        return this.value;
    }

    public double getKcal() {
        return this.kcal;
    }

    public double getProtein() {
        return this.protein;
    }

    public double getLipid() {
        return this.lipid;
    }

    public double getCarbohydrate() {
        return this.carbohydrate;
    }

    public double getSalt() {
        return this.salt;
    }

    public int getCalcium() {
        return this.calcium;
    }

    public int getVegetable() {
        return this.vegetable;
    }



}
