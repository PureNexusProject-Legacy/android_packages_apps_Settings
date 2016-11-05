/*
 * Copyright (C) 2016 The Pure Nexus Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.nexus;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.preference.Preference;

import com.android.internal.logging.MetricsProto.MetricsEvent;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class About extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.nexus_about);
    }

    @Override
    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.getKey().equals("updates")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.update_dialog);
            builder.setItems(R.array.update_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] notificationValues = {"https://www.pushbullet.com/channel?tag=purenexus",
                        "https://telegram.me/PureNexus", "https://plus.google.com/collection/4HRmkB"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = notificationValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("social")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.social_dialog);
            builder.setItems(R.array.social_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] socialValues = {"https://plus.google.com/communities/103055954354785266764",
                        "https://www.reddit.com/r/PureNexus/", "https://telegram.me/joinchat/C1UAJz7YAdFlelpxIqKMEQ"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = socialValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("nate")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.nate_dialog);
            builder.setItems(R.array.nate_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] nateValues = {"https://plus.google.com/+NathanBenis",
                        "https://twitter.com/BeansTown106", "forum.xda-developers.com/member.php?u=4395895"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = nateValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("devon")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.devon_dialog);
            builder.setItems(R.array.dev_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] devValues = {"https://plus.google.com/+DevonWitherell",
                        "https://play.google.com/store/apps/developer?id=dwitherell",
                        "https://twitter.com/withere2",
                        "http://forum.xda-developers.com/member.php?u=4041997"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = devValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("nathan")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.nathan_dialog);
            builder.setItems(R.array.nathan_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] nathanValues = {"https://plus.google.com/+NathanChancellor",
                        "http://forum.xda-developers.com/member.php?u=6842057"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = nathanValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("davey")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.davey_dialog);
            builder.setItems(R.array.davey_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] daveyValues = {"https://plus.google.com/+DavidWilsonAnnihilation",
                        "https://play.google.com/store/apps/developer?id=daveyannihilation",
                        "https://twitter.com/d_annihilation",
                        "http://forum.xda-developers.com/member.php?u=4603975"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = daveyValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("surge")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.surge_dialog);
            builder.setItems(R.array.surge_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] surgeValues = {"https://plus.google.com/109273915986671208869",
                        "http://forum.xda-developers.com/member.php?u=4939386"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = surgeValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("bajasur")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.bajasur_dialog);
            builder.setItems(R.array.bajasur_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] bajasurValues = {"https://plus.google.com/+BajaSur2011",
                        "https://twitter.com/BajaSur83",
                        "http://forum.xda-developers.com/member.php?u=4854133"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = bajasurValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        }
        return super.onPreferenceTreeClick(preference);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.PURE;
    }
}
