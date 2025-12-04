package net.minecraft.util;

public interface IProgressUpdate
{
    /**
     * "Saving level", or the loading,or downloading equivelent
     */
    void displayProgressMessage(String p_73720_1_);

    /**
     this string, followed by "working..." and then the "% complete" are the 3 lines shown. This resets progress to 0,
     * and the WorkingString to "working...".
     * Displays a string on the loading screen supposed to indicate what is being done currently.
     */
    void resetProgresAndWorkingMessage(String p_73719_1_);

    void resetProgressAndMessage(String p_73721_1_);

    /**
     * Updates the progress bar on the loading screen to the specified amount. Args: loadProgress
     */
    void setLoadingProgress(int p_73718_1_);

    void func_146586_a();
}
