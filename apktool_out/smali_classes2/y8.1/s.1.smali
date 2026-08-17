.class Ly8/s;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:Ly8/u;


# direct methods
.method public constructor <init>(Ly8/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly8/s;->g:Ly8/u;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/s;->g:Ly8/u;

    .line 2
    .line 3
    check-cast p1, Lk8/b;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ly8/u;->J0(Ly8/u;Lk8/b;)LL7/h0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
