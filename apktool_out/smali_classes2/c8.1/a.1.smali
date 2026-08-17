.class Lc8/a;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:Lc8/d;

.field private final h:Lc8/d$a;


# direct methods
.method public constructor <init>(Lc8/d;Lc8/d$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc8/a;->g:Lc8/d;

    .line 5
    .line 6
    iput-object p2, p0, Lc8/a;->h:Lc8/d$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc8/a;->g:Lc8/d;

    .line 2
    .line 3
    iget-object v1, p0, Lc8/a;->h:Lc8/d$a;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lc8/d;->a(Lc8/d;Lc8/d$a;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
