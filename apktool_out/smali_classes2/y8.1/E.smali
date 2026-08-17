.class Ly8/E;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:Ly8/K;

.field private final h:Lm8/p;

.field private final i:Ly8/d;


# direct methods
.method public constructor <init>(Ly8/K;Lm8/p;Ly8/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly8/E;->g:Ly8/K;

    .line 5
    .line 6
    iput-object p2, p0, Ly8/E;->h:Lm8/p;

    .line 7
    .line 8
    iput-object p3, p0, Ly8/E;->i:Ly8/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ly8/E;->g:Ly8/K;

    .line 2
    .line 3
    iget-object v1, p0, Ly8/E;->h:Lm8/p;

    .line 4
    .line 5
    iget-object v2, p0, Ly8/E;->i:Ly8/d;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ly8/K;->c(Ly8/K;Lm8/p;Ly8/d;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
