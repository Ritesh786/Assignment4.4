package com.acadgild.fujitsu.assignment44;

/**
 * Created by Fujitsu on 15/04/2017.
 */

public class PojoClass {

    private String name;
       private long image;

               public PojoClass() {
          }
      public PojoClass(long image,String name) {

          this.image = image;
          this.name = name;

           }

                public String getName() {
                return name;
            }

                public void setName(String name) {
                this.name = name;
            }

                public long getImage() {
                return image;
            }

                public void setImage(long image) {
                this.image = image;
            }
    }




