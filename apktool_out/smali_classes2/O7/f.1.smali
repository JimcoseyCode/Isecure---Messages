.class LO7/f;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:LO7/g;


# direct methods
.method public constructor <init>(LO7/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO7/f;->g:LO7/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/f;->g:LO7/g;

    .line 2
    .line 3
    check-cast p1, LD8/g;

    .line 4
    .line 5
    invoke-static {v0, p1}, LO7/g;->I0(LO7/g;LD8/g;)LC8/d0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
