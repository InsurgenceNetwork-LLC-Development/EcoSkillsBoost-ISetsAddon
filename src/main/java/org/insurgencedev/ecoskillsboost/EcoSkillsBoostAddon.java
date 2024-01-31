package org.insurgencedev.ecoskillsboost;

import org.insurgencedev.ecoskillsboost.listeners.SkillsExperienceGainListener;
import org.insurgencedev.insurgencesets.api.addon.ISetsAddon;
import org.insurgencedev.insurgencesets.api.addon.InsurgenceSetsAddon;
import org.insurgencedev.insurgencesets.libs.fo.Common;

@ISetsAddon(name = "EcoSkillsBoost", version = "1.0.2", author = "Insurgence Dev Team", description = "Boost the skill experience earned from EcoSkills")
public class EcoSkillsBoostAddon extends InsurgenceSetsAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (Common.doesPluginExist("EcoSkills")) {
            registerEvent(new SkillsExperienceGainListener());
        }
    }
}
