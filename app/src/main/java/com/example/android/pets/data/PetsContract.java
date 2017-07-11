package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Harshit Maheshwari on 11-07-2017.
 */
public final class PetsContract {

    public static final class PetsEntry implements BaseColumns{

        /**
         * Constants like table name and column name
         */

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;

        public static final String COLUMN_PET_NAME = "name";

        public static final String COLUMN_PET_BREED = "breed";

        public static final String COLUMN_PET_GENDER = "gender";

        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * Constants integers representing the gender
         */

        public static final int GENDER_UNKNOWN = 0;

        public static final int GENDER_MALE = 1;

        public static final int GENDER_FEMALE = 2;

    }

}
