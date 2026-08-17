.class LA8/L;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LA8/w$c;

.field private final h:LA8/w;


# direct methods
.method public constructor <init>(LA8/w$c;LA8/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA8/L;->g:LA8/w$c;

    .line 5
    .line 6
    iput-object p2, p0, LA8/L;->h:LA8/w;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LA8/L;->g:LA8/w$c;

    .line 2
    .line 3
    iget-object v1, p0, LA8/L;->h:LA8/w;

    .line 4
    .line 5
    invoke-static {v0, v1}, LA8/w$c;->l(LA8/w$c;LA8/w;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
