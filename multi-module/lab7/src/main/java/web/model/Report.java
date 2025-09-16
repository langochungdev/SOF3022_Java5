package web.model;

import java.io.Serializable;

public interface Report {
    Serializable getGroup();
    Double getSum();
    Long getCount();
}
