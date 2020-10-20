import java.sql.Statement;

public class Statment implements Cloneable{
    private String projection;
    private String from;
    private String where;
    private String groupBy;
    private String orderBy;
    private Record record;

    public Statment(String projection, String from, String where, String groupBy, String orderBy) {
        this.projection = projection;
        this.from = from;
        this.where = where;
        this.groupBy = groupBy;
        this.orderBy = orderBy;
        this.record=new Record();
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public String getProjection() {
        return projection;
    }

    public void setProjection(String projection) {
        this.projection = projection;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public Statment clone()  {
        try {
            return (Statment) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static StatmentBuilder getBuilder(){
        return new StatmentBuilder();
    }

    public static class StatmentBuilder {
        private String projection;
        private String from;
        private String where;
        private String groupBy;
        private String orderBy;

        public StatmentBuilder setProjection(String projection) {
            this.projection = projection;
            return this;
        }

        public StatmentBuilder setFrom(String from) {
            this.from = from;
            return this;
        }

        public StatmentBuilder setWhere(String where) {
            this.where = where;
            return this;
        }

        public StatmentBuilder setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        public StatmentBuilder setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Statment createStatment() {
            return new Statment(projection, from, where, groupBy, orderBy);
        }
    }
}
