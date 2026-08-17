.class LC8/z0;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:LC8/A0;


# direct methods
.method public constructor <init>(LC8/A0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC8/z0;->g:LC8/A0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/z0;->g:LC8/A0;

    .line 2
    .line 3
    check-cast p1, LC8/A0$b;

    .line 4
    .line 5
    invoke-static {v0, p1}, LC8/A0;->b(LC8/A0;LC8/A0$b;)LC8/S;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
