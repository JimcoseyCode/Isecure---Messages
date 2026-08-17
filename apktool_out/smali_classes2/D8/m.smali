.class LD8/m;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LD8/n;

.field private final h:LD8/g;


# direct methods
.method public constructor <init>(LD8/n;LD8/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD8/m;->g:LD8/n;

    .line 5
    .line 6
    iput-object p2, p0, LD8/m;->h:LD8/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LD8/m;->g:LD8/n;

    .line 2
    .line 3
    iget-object v1, p0, LD8/m;->h:LD8/g;

    .line 4
    .line 5
    invoke-static {v0, v1}, LD8/n;->f(LD8/n;LD8/g;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
