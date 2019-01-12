package arisyrifki.app.test.Model;

import java.io.Serializable;

/**
 * Created by rfkchrl on 1/13/2019.
 */

public class ModelSch implements Serializable {
    public String schTitle, schSubtitle;
    public int imgSch;

    public String getSchTitle() {
        return schTitle;
    }

    public String getSchSubtitle() {
        return schSubtitle;
    }

    public int getImgSch() {
        return imgSch;
    }

    public ModelSch(String schTitle, String schSubtitle, int imgSch) {
        this.schTitle = schTitle;
        this.schSubtitle = schSubtitle;
        this.imgSch = imgSch;
    }
}
