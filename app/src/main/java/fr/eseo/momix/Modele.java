package fr.eseo.momix;

/**
 * Created by etudiant on 03/02/2015.
 */
    public class Modele{

        private int icon;
        private String title;
        private Word word;

        public Modele(String title, Word w) {
            super();
            this.icon = R.mipmap.ic_action_remove;
            this.title = title;
            this.word = w;
        }


    public int getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public Word getWord() {
        return word;
    }
}

