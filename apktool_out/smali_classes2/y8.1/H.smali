.class Ly8/H;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:Ly8/K;

.field private final h:Ly8/N;

.field private final i:Lm8/p;

.field private final j:Ly8/d;

.field private final k:I

.field private final l:Lf8/u;


# direct methods
.method public constructor <init>(Ly8/K;Ly8/N;Lm8/p;Ly8/d;ILf8/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly8/H;->g:Ly8/K;

    .line 5
    .line 6
    iput-object p2, p0, Ly8/H;->h:Ly8/N;

    .line 7
    .line 8
    iput-object p3, p0, Ly8/H;->i:Lm8/p;

    .line 9
    .line 10
    iput-object p4, p0, Ly8/H;->j:Ly8/d;

    .line 11
    .line 12
    iput p5, p0, Ly8/H;->k:I

    .line 13
    .line 14
    iput-object p6, p0, Ly8/H;->l:Lf8/u;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Ly8/H;->g:Ly8/K;

    .line 2
    .line 3
    iget-object v1, p0, Ly8/H;->h:Ly8/N;

    .line 4
    .line 5
    iget-object v2, p0, Ly8/H;->i:Lm8/p;

    .line 6
    .line 7
    iget-object v3, p0, Ly8/H;->j:Ly8/d;

    .line 8
    .line 9
    iget v4, p0, Ly8/H;->k:I

    .line 10
    .line 11
    iget-object v5, p0, Ly8/H;->l:Lf8/u;

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Ly8/K;->f(Ly8/K;Ly8/N;Lm8/p;Ly8/d;ILf8/u;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
