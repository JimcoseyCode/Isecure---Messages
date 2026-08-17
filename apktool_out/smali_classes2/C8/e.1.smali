.class LC8/e;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:Ljava/util/Collection;

.field private final h:LC8/u0;

.field private final i:LG8/o;

.field private final j:LG8/j;


# direct methods
.method public constructor <init>(Ljava/util/Collection;LC8/u0;LG8/o;LG8/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC8/e;->g:Ljava/util/Collection;

    .line 5
    .line 6
    iput-object p2, p0, LC8/e;->h:LC8/u0;

    .line 7
    .line 8
    iput-object p3, p0, LC8/e;->i:LG8/o;

    .line 9
    .line 10
    iput-object p4, p0, LC8/e;->j:LG8/j;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LC8/e;->g:Ljava/util/Collection;

    .line 2
    .line 3
    iget-object v1, p0, LC8/e;->h:LC8/u0;

    .line 4
    .line 5
    iget-object v2, p0, LC8/e;->i:LG8/o;

    .line 6
    .line 7
    iget-object v3, p0, LC8/e;->j:LG8/j;

    .line 8
    .line 9
    check-cast p1, LC8/u0$a;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, LC8/g;->a(Ljava/util/Collection;LC8/u0;LG8/o;LG8/j;LC8/u0$a;)Li7/B;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
