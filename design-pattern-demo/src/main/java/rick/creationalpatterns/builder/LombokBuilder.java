package rick.creationalpatterns.builder;

/**
 * @author fengrui
 * @date 2022/5/16
 * @description lombok @Builder
 */
public class LombokBuilder {
    private String partA;
    private String partB;
    private String partC;

    LombokBuilder(String partA, String partB, String partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    public static ChainBuilderBuilder builder() {
        return new ChainBuilderBuilder();
    }

    public static class ChainBuilderBuilder {
        private String partA;
        private String partB;
        private String partC;

        ChainBuilderBuilder() {
        }

        public ChainBuilderBuilder partA(String partA) {
            this.partA = partA;
            return this;
        }

        public ChainBuilderBuilder partB(String partB) {
            this.partB = partB;
            return this;
        }

        public ChainBuilderBuilder partC(String partC) {
            this.partC = partC;
            return this;
        }

        public LombokBuilder build() {
            return new LombokBuilder(this.partA, this.partB, this.partC);
        }

        @Override
        public String toString() {
            return "ChainBuilder.ChainBuilderBuilder(partA=" + this.partA + ", partB=" + this.partB + ", partC=" + this.partC + ")";
        }
    }

    @Override
    public String toString() {
        return "LombokBuilder{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }
}
