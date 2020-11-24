package sustech.dbojbackend.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import sustech.dbojbackend.model.SqlLanguage;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CommitQuery implements Serializable {
    private static final long serialVersionUID = 4162220202L;

    public Long questionId;
    public SqlLanguage language;
    /**
     * 0 to Run, unzero value means use table i to test
     */
    public Integer testOrRun;
    public String commitCode;
}
