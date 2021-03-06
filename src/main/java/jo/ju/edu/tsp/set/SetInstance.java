package jo.ju.edu.tsp.set;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class SetInstance {
    public final static SetDetails
            SIMPLE   = f("simple", 5, "simple5.xml"),
            DJB2036  = f("djb2036", 2036, "djb2036.xml"),
            IDA8197  = f("ida8197", 8197, "ida8197.xml"),
            PCB3038  = f("pcb3038", 3038, "pcb3038.xml"),
            RL1304   = f("rl1304", 1304,"rl1304.xml"),
            RL5934   = f("rl5934", 5934,"rl5934.xml"),
            XMC10150 = f("xmc10150", 10150, "xmc10150.xml"),
            XSC6880  = f("xsc6880", 6880, "xsc6880.xml");

    private static @NotNull SetDetails f(@NotNull String name, int size, @NotNull String uri) {
        return new SetDetails(new File(SetInstance.class.getClassLoader().getResource("dataset/must/" + uri).getFile()),
                size, name);
    }
}
