package sustech.dbojbackend.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommitDeleteRequest {
    Long questionOrder;
}
