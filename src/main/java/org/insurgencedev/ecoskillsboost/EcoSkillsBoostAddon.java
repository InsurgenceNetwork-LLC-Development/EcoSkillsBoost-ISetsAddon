package org.insurgencedev.ecoskillsboost;

import org.bukkit.Bukkit;
import org.insurgencedev.insurgencesets.api.addon.ISetsAddon;
import org.insurgencedev.insurgencesets.api.addon.InsurgenceSetsAddon;
import org.insurgencedev.insurgencesets.libs.fo.Common;

@ISetsAddon(name = "EcoSkillsBoost", version = "1.0.0", author = "Insurgence Dev Team", description = "Boost the skill experience earned from EcoSkills")
public class EcoSkillsBoostAddon extends InsurgenceSetsAddon {

    @Override
    public void onAddonStart() {
        if (isDependentEnabled()) {
            registerEvent(new SkillsExperienceGainListener());
        }
    }

    private boolean isDependentEnabled() {
        return Bukkit.getPluginManager().isPluginEnabled("EcoSkills");
    }
}
