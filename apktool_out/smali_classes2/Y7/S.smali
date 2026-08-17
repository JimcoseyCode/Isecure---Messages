.class LY7/S;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:LY7/U;


# direct methods
.method public constructor <init>(LY7/U;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY7/S;->g:LY7/U;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/S;->g:LY7/U;

    .line 2
    .line 3
    check-cast p1, Lk8/f;

    .line 4
    .line 5
    invoke-static {v0, p1}, LY7/U;->r(LY7/U;Lk8/f;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
