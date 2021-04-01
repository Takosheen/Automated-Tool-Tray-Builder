package com.example.automatedtooltraybuilder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;





/*
//CAPTURE IMAGE CODE WIP, Based off of android example code atm-----------------------------
static final int REQUEST_IMAGE_CAPTURE=1;
        string currentPhotoPath;

private void dispatchTakePictureIntent(){
        Intent takePictureIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        try{
        startActivityForResult(takePictureIntent,REQUEST_IMAGE_CAPTURE);
        }
        catch(ActivityNotFoundException e){
        System.out.println("An error has occured, image capture failed.")
        }
        }

//Creates image as a JPG, with date and path.
private File createImageFile()throws IOException{
        //File Image Created
        String timeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName="JPEG_"+timestamp+"_";
        File storageDir=getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image=File.createTempFile(
        imageFileName,
        ".jpg",
        storageDir);

        currentPhotoPath=image.getAbsolutePath();
        return image;

        }

private void dispatchTakePictureIntent(){
        Intent takePictureIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takePictureIntent.resolveActivity(getPackageManager())!=null)
        {
        File photoFile=null;
        try
        {
        photoFile=createImageFile();
        }
        catch(IOException excep)
        {
        System.out.println("An error has occurred")
        }
        if (photoFile != null)
            {
        Uri photoURI = FileProvider.getUriForFile(this, "com.example.android.fileprovider",
                                                            photoFile);
          takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
          startActivityForResult(takePictureIntent,REQUEST_IMAGE_CAPTURE);

            }
          }
        }
      }




//END OF CAPTURE IMAGE CODE------------------------------------------

*/



public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}