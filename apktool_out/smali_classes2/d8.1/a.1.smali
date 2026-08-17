.class Ld8/a;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:Ld8/d;


# direct methods
.method public constructor <init>(Ld8/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld8/a;->g:Ld8/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld8/a;->g:Ld8/d;

    .line 2
    .line 3
    check-cast p1, Ld8/x;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ld8/d;->B(Ld8/d;Ld8/x;)Ld8/g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
