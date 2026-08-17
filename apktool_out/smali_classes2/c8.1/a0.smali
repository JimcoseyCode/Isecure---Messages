.class Lc8/a0;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:LL7/t0;


# direct methods
.method public constructor <init>(LL7/t0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc8/a0;->g:LL7/t0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/a0;->g:LL7/t0;

    .line 2
    .line 3
    check-cast p1, LL7/b;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lc8/e0;->b(LL7/t0;LL7/b;)LC8/S;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
