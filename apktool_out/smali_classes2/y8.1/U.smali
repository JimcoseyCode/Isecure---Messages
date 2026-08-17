.class Ly8/U;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:Ly8/X;

.field private final h:Lf8/q;


# direct methods
.method public constructor <init>(Ly8/X;Lf8/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly8/U;->g:Ly8/X;

    .line 5
    .line 6
    iput-object p2, p0, Ly8/U;->h:Lf8/q;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/U;->g:Ly8/X;

    .line 2
    .line 3
    iget-object v1, p0, Ly8/U;->h:Lf8/q;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ly8/X;->c(Ly8/X;Lf8/q;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
