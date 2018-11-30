// original filename: 00027935.txt
// before
public class Class00000041Worse {
    @Path("rebase")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RebaseResponse rebase(RebaseRequest request) throws ApiException {
        try (GitConnection gitConnection = getGitConnection()) {
            return gitConnection.rebase(request);
        }
    }
}
