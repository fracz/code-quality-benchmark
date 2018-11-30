// original filename: 00027935.txt
// after
public class Class00000041Better {
    @POST
    @Path("rebase")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RebaseResponse rebase(RebaseRequest request) throws ApiException {
        try (GitConnection gitConnection = getGitConnection()) {
            return gitConnection.rebase(request.getOperation(), request.getBranch());
        }
    }
}
