.class Lc8/c;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:Lc8/d;

.field private final h:LG8/o;


# direct methods
.method public constructor <init>(Lc8/d;LG8/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc8/c;->g:Lc8/d;

    .line 5
    .line 6
    iput-object p2, p0, Lc8/c;->h:LG8/o;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc8/c;->g:Lc8/d;

    .line 2
    .line 3
    iget-object v1, p0, Lc8/c;->h:LG8/o;

    .line 4
    .line 5
    check-cast p1, Lc8/d$a;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lc8/d;->c(Lc8/d;LG8/o;Lc8/d$a;)Ljava/lang/Iterable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
