/*
Copyright (C) 2011 by Indrajit Khare

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/

package com.heibuddy.slidingmenuimp.model;

import java.util.ArrayList;
import java.util.List;

import com.heibuddy.R;

public class MenuDataSource {

    private final List<SlidingMenu> animals = new ArrayList<SlidingMenu>();

    public MenuDataSource() {
        animals.add(new SlidingMenu(R.drawable.aa_avatar_default_circle, "С��飡", "logo"));
        
        animals.add(new SlidingMenu(null, "������", null));
        animals.add(new SlidingMenu(R.drawable.aa_connect_usb_icon, "��һ��", null));
        animals.add(new SlidingMenu(R.drawable.aa_connect_wifi_icon, "�̽�TA", null));
        animals.add(new SlidingMenu(R.drawable.aa_management_apps_icon, "�����", null));
        
        animals.add(new SlidingMenu(null, "����", null));
        animals.add(new SlidingMenu(R.drawable.aa_management_pictures_icon, "С˵", null));
        animals.add(new SlidingMenu(R.drawable.aa_management_video_icon, "��Ƶ", null));
        animals.add(new SlidingMenu(R.drawable.aa_management_music_icon, "����", null));
        animals.add(new SlidingMenu(R.drawable.aa_management_music_icon, "����", null));
        animals.add(new SlidingMenu(R.drawable.aa_management_video_icon, "Ӧ��", null));
        animals.add(new SlidingMenu(R.drawable.aa_management_video_icon, "����", null));
    }

    public List<SlidingMenu> getAnimals() {
        return animals;
    }
}
