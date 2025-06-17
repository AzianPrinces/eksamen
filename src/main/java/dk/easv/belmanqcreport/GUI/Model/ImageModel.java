package dk.easv.belmanqcreport.GUI.Model;

import dk.easv.belmanqcreport.BE.MyImage;
import dk.easv.belmanqcreport.BLL.Manager.ImageManager;

import java.util.List;

public class ImageModel {

    private final ImageManager imageManager;

    public ImageModel() throws Exception {
        imageManager = new ImageManager();
    }

    public MyImage saveNewImage(MyImage img) throws Exception {
        return imageManager.createImage(img);
    }

    public void updateImage(MyImage img) {
        imageManager.updateImage(img);
    }

    public void deleteImage(MyImage img) {
        imageManager.deleteImage(img);
    }

    public List<MyImage> getImageForOrderItem(int orderID) throws Exception {
        return imageManager.getImagesForOrderItem(orderID);
    }

    public void updateComment(MyImage img) throws Exception {
        imageManager.updateComment(img);
    }

    //Validation part

    /*public void updateValidation(int orderItemID, int validationTypeID) throws Exception {
        imageManager.updateItemStatus(orderItemID, validationTypeID);
    }*/

//    public int getValidationType(int orderItemID) throws Exception {
//        return imageManager.getValidationType(orderItemID);
//    }

    public void updateImageStatus(int imageID, int validationTypeID) throws Exception {
        imageManager.updateImageStatus(imageID, validationTypeID);
    }

}
