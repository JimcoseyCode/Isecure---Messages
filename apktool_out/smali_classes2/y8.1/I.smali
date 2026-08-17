.class Ly8/I;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:Ly8/K;

.field private final h:Lf8/n;

.field private final i:LA8/N;


# direct methods
.method public constructor <init>(Ly8/K;Lf8/n;LA8/N;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly8/I;->g:Ly8/K;

    .line 5
    .line 6
    iput-object p2, p0, Ly8/I;->h:Lf8/n;

    .line 7
    .line 8
    iput-object p3, p0, Ly8/I;->i:LA8/N;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ly8/I;->g:Ly8/K;

    .line 2
    .line 3
    iget-object v1, p0, Ly8/I;->h:Lf8/n;

    .line 4
    .line 5
    iget-object v2, p0, Ly8/I;->i:LA8/N;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ly8/K;->g(Ly8/K;Lf8/n;LA8/N;)Lq8/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
