package YatzyBlok.YazyBlokFelter.Felter.Special;

public class royal extends SpecialFelter{

    public royal(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        int[] antal = antalTaeller(terninger);
        return !this.erBrugt() && antal[0] >= 1 && antal[1] >= 1 && antal[2] >= 1 && antal[3] >= 1 && antal[4] >= 1 && antal[5] >= 1;
    }

    public int[] beregnMulige(int[] terninger) {
        return new int[]{1,2,3,4,5,6};
    }
    @Override
    public int beregnPoint(int[] terninger) {
        return 30;
    }
}

