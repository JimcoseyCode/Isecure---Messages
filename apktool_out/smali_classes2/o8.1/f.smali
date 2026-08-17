.class Lo8/f;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field private final g:LL7/a;

.field private final h:LL7/a;


# direct methods
.method public constructor <init>(LL7/a;LL7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo8/f;->g:LL7/a;

    .line 5
    .line 6
    iput-object p2, p0, Lo8/f;->h:LL7/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lo8/f;->g:LL7/a;

    .line 2
    .line 3
    iget-object v1, p0, Lo8/f;->h:LL7/a;

    .line 4
    .line 5
    check-cast p1, LL7/m;

    .line 6
    .line 7
    check-cast p2, LL7/m;

    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lo8/g;->d(LL7/a;LL7/a;LL7/m;LL7/m;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
